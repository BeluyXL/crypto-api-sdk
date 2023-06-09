

# BlockHeightReachedRI


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**blockHeightReached** | **Long** | Represents the specified value of block height for which the callback will be received. |  |
|**callbackSecretKey** | **String** | Represents the Secret Key value provided by the customer. This field is used for security purposes during the callback notification, in order to prove the sender of the callback as Crypto APIs. For more information please see our [Documentation](https://developers.cryptoapis.io/technical-documentation/general-information/callbacks#callback-security). |  |
|**callbackUrl** | **String** | Represents the URL that is set by the customer where the callback will be received at. The callback notification will be received only if and when the event occurs. We support ONLY httpS type of protocol. |  |
|**createdTimestamp** | **Integer** | Defines the specific time/date when the subscription was created in Unix Timestamp. |  |
|**isActive** | **Boolean** | Defines whether the subscription is active or not. Set as boolean. |  |
|**referenceId** | **String** | Represents a unique ID used to reference the specific callback subscription. |  |



