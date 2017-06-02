package fi.metatavu.linkedevents.client;

public class ApiResponse<T> {

  private int status;
  private String message;
  private T response;

  public ApiResponse(int status, String message, T response) {
    this.status = status; 
    this.response = response;
    this.message = message;
  }

  public T getResponse() {
    return response;
  }

  public int getStatus() {
    return status;
  }
  
  public String getMessage() {
    return message;
  }

  public boolean isOk() {
    return status >= 200 && status <= 299;
  }
}