/* tslint:disable */
/* eslint-disable */
/**
 * OpenAPI Petstore
 * This is a sample server Petstore server. For this sample, you can use the api key `special-key` to test the authorization filters.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { mapValues } from '../runtime';
import type { ErrorCode } from './ErrorCode';
import {
    ErrorCodeFromJSON,
    ErrorCodeFromJSONTyped,
    ErrorCodeToJSON,
} from './ErrorCode';

/**
 * Mandatory part of each response given by our API
 * @export
 * @interface ResponseMeta
 */
export interface ResponseMeta {
    /**
     * Code returned by the function
     * @type {string}
     * @memberof ResponseMeta
     */
    code: ResponseMetaCodeEnum;
    /**
     * Explanation of what went wrong
     * @type {string}
     * @memberof ResponseMeta
     */
    detail?: string;
    /**
     * Message of the exception that will help developer to debug this problem if needed
     * @type {string}
     * @memberof ResponseMeta
     */
    exception?: string;
    /**
     * Type of error
     * @type {string}
     * @memberof ResponseMeta
     */
    type?: string;
    /**
     * 
     * @type {ErrorCode}
     * @memberof ResponseMeta
     */
    errorCode?: ErrorCode;
    /**
     * An array of all the specific error encountered during the request
     * @type {Array<Error>}
     * @memberof ResponseMeta
     */
    errors?: Array<Error>;
}


/**
 * @export
 */
export const ResponseMetaCodeEnum = {
    Ok: 'Ok',
    GenericException: 'Generic_Exception',
    FieldErrorException: 'Field_Error_Exception',
    ImageValidationException: 'Image_Validation_Exception',
    InvalidContainerCreationWithNoDefaultAssetException: 'Invalid_Container_Creation_With_No_Default_Asset_Exception',
    InvalidOverrideModeException: 'Invalid_Override_Mode_Exception',
    InvalidTagException: 'Invalid_Tag_Exception',
    ItemUseException: 'Item_Use_Exception',
    MissingPlatformForSoftwareException: 'Missing_Platform_For_Software_Exception',
    MissingSoftwareForPlatformException: 'Missing_Software_For_Platform_Exception',
    PlatformNotSupportedException: 'Platform_Not_Supported_Exception',
    RefreshDataException: 'Refresh_Data_Exception',
    RoleAssignmentException: 'Role_Assignment_Exception',
    TaskAlreadyRunningException: 'Task_Already_Running_Exception',
    LoggedOutException: 'Logged_Out_Exception',
    AuthorizationException: 'Authorization_Exception',
    UnauthorizedActionForCurrentUserException: 'Unauthorized_Action_For_Current_User_Exception',
    UserAlreadyExistsButIsNotAuthenticatedException: 'User_Already_Exists_But_Is_Not_Authenticated_Exception',
    UserAlreadyHasActiveOrClosedGalaxieApiProductException: 'User_Already_Has_Active_Or_Closed_Galaxie_Api_Product_Exception',
    UserAlreadyHasMultipleGalaxieApiProductsException: 'User_Already_Has_Multiple_Galaxie_Api_Products_Exception',
    RecurlyApiException: 'Recurly_Api_Exception',
    RecurlyTransactionErrorException: 'Recurly_Transaction_Error_Exception',
    GalaxieApiException: 'Galaxie_Api_Exception'
} as const;
export type ResponseMetaCodeEnum = typeof ResponseMetaCodeEnum[keyof typeof ResponseMetaCodeEnum];


/**
 * Check if a given object implements the ResponseMeta interface.
 */
export function instanceOfResponseMeta(value: object): value is ResponseMeta {
    if (!('code' in value) || value['code'] === undefined) return false;
    return true;
}

export function ResponseMetaFromJSON(json: any): ResponseMeta {
    return ResponseMetaFromJSONTyped(json, false);
}

export function ResponseMetaFromJSONTyped(json: any, ignoreDiscriminator: boolean): ResponseMeta {
    if (json == null) {
        return json;
    }
    return {
        
        'code': json['code'],
        'detail': json['detail'] == null ? undefined : json['detail'],
        'exception': json['exception'] == null ? undefined : json['exception'],
        'type': json['type'] == null ? undefined : json['type'],
        'errorCode': json['errorCode'] == null ? undefined : ErrorCodeFromJSON(json['errorCode']),
        'errors': json['errors'] == null ? undefined : json['errors'],
    };
}

export function ResponseMetaToJSON(value?: ResponseMeta | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'code': value['code'],
        'detail': value['detail'],
        'exception': value['exception'],
        'type': value['type'],
        'errorCode': ErrorCodeToJSON(value['errorCode']),
        'errors': value['errors'],
    };
}

