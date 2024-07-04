/* tslint:disable */
/* eslint-disable */
/**
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { mapValues } from '../runtime';
/**
 * 
 * @export
 * @interface TestInlineFreeformAdditionalPropertiesRequest
 */
export interface TestInlineFreeformAdditionalPropertiesRequest {
    [key: string]: any | any;
    /**
     * 
     * @type {string}
     * @memberof TestInlineFreeformAdditionalPropertiesRequest
     */
    someProperty?: string;
}

/**
 * Check if a given object implements the TestInlineFreeformAdditionalPropertiesRequest interface.
 */
export function instanceOfTestInlineFreeformAdditionalPropertiesRequest(value: object): value is TestInlineFreeformAdditionalPropertiesRequest {
    return true;
}

export function TestInlineFreeformAdditionalPropertiesRequestFromJSON(json: any): TestInlineFreeformAdditionalPropertiesRequest {
    return TestInlineFreeformAdditionalPropertiesRequestFromJSONTyped(json, false);
}

export function TestInlineFreeformAdditionalPropertiesRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): TestInlineFreeformAdditionalPropertiesRequest {
    if (json == null) {
        return json;
    }
    return {
        
            ...json,
        'someProperty': json['someProperty'] == null ? undefined : json['someProperty'],
    };
}

export function TestInlineFreeformAdditionalPropertiesRequestToJSON(value?: TestInlineFreeformAdditionalPropertiesRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
            ...value,
        'someProperty': value['someProperty'],
    };
}

