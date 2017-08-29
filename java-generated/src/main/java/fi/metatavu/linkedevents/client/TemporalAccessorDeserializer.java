package fi.metatavu.linkedevents.client;

import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.TemporalAccessor;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

public class TemporalAccessorDeserializer extends JsonDeserializer<TemporalAccessor> {

  private static final DateTimeFormatter DATE_TIME_FORMATTER = new DateTimeFormatterBuilder()
      .parseCaseInsensitive()
      .append(DateTimeFormatter.ISO_LOCAL_DATE)
      .optionalStart()
      .appendLiteral('T')
      .append(DateTimeFormatter.ISO_LOCAL_TIME)
      .appendOffsetId()
      .toFormatter();

  @Override
  public TemporalAccessor deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
    JsonToken currentToken = jsonParser.getCurrentToken();

    if (currentToken.equals(JsonToken.VALUE_STRING)) {
      String text = jsonParser.getText().trim();
      if (text != null) {
        return DATE_TIME_FORMATTER.parse(text);
      }
      
      throw deserializationContext.weirdStringException(text, TemporalAccessor.class, String.format("%s could not be deserialized", text));
    } else if (currentToken.equals(JsonToken.VALUE_NULL)) {
      return getNullValue(deserializationContext);
    }

    throw deserializationContext.mappingException(Boolean.class);
  }

}
