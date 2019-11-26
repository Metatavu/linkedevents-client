/**
 * Linked Events information API
 * Linked Events provides categorized data on events and places using JSON-LD format.  Events can be searched by date and location. Location can be exact address or larger area such as neighbourhood or borough  JSON-LD format is streamlined using include mechanism. API users can request that certain fields are included directly into the result, instead of being hyperlinks to objects.  Several fields are multilingual. These are implemented as object with each language variant as property. In this specification each multilingual field has (fi,sv,en) property triplet as example.
 *
 * OpenAPI spec version: v1
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 2.2.3
 *
 * Do not edit the class manually.
 *
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['ApiClient'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'));
  } else {
    // Browser globals (root is window)
    if (!root.LinkedeventsClient) {
      root.LinkedeventsClient = {};
    }
    root.LinkedeventsClient.Eventlink = factory(root.LinkedeventsClient.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The Eventlink model module.
   * @module model/Eventlink
   * @version 0.0.12
   */

  /**
   * Constructs a new <code>Eventlink</code>.
   * Links to entities that the event publisher considers related to this event. Eg. links to catering service available during theatrical production. The links will most likely point to unstructured content, ie. web pages suitable for human viewing.
   * @alias module:model/Eventlink
   * @class
   */
  var exports = function() {
    var _this = this;




  };

  /**
   * Constructs a <code>Eventlink</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/Eventlink} obj Optional instance to populate.
   * @return {module:model/Eventlink} The populated <code>Eventlink</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('name')) {
        obj['name'] = ApiClient.convertToType(data['name'], 'String');
      }
      if (data.hasOwnProperty('link')) {
        obj['link'] = ApiClient.convertToType(data['link'], 'String');
      }
      if (data.hasOwnProperty('language')) {
        obj['language'] = ApiClient.convertToType(data['language'], 'String');
      }
    }
    return obj;
  }

  /**
   * Name describing contents of the link
   * @member {String} name
   */
  exports.prototype['name'] = undefined;
  /**
   * link to an external related entity
   * @member {String} link
   */
  exports.prototype['link'] = undefined;
  /**
   * language of the content behind the link
   * @member {String} language
   */
  exports.prototype['language'] = undefined;



  return exports;
}));


