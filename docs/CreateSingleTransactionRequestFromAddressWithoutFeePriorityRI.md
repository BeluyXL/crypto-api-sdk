

# CreateSingleTransactionRequestFromAddressWithoutFeePriorityRI


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**callbackSecretKey** | **String** | Represents the Secret Key value provided by the customer. This field is used for security purposes during the callback notification, in order to prove the sender of the callback as Crypto APIs. For more information please see our [Documentation](https://developers.cryptoapis.io/technical-documentation/general-information/callbacks#callback-security). |  [optional] |
|**callbackUrl** | **String** | Represents the URL that is set by the customer where the callback will be received at. The callback notification will be received only if and when the event occurs. &#x60;We support ONLY httpS type of protocol&#x60;. |  [optional] |
|**classicAddress** | **String** | Represents the public address, which is a compressed and shortened form of a public key. The classic address is shown when the source address is an x-Address. |  [optional] |
|**note** | **String** | Represents an optional note to add a free text in, explaining or providing additional detail on the transaction request. |  [optional] |
|**recipient** | [**List&lt;CreateSingleTransactionRequestFromAddressWithoutFeePriorityRIRecipientInner&gt;**](CreateSingleTransactionRequestFromAddressWithoutFeePriorityRIRecipientInner.md) | Defines the destination for the transaction, i.e. the recipient(s). |  |
|**sender** | [**CreateSingleTransactionRequestFromAddressWithoutFeePriorityRISender**](CreateSingleTransactionRequestFromAddressWithoutFeePriorityRISender.md) |  |  |
|**transactionRequestId** | **String** | Represents a unique identifier of the transaction request (the request sent to make a transaction), which helps in identifying which callback and which &#x60;referenceId&#x60; concern that specific transaction request. |  |
|**transactionRequestStatus** | [**TransactionRequestStatusEnum**](#TransactionRequestStatusEnum) | Defines the status of the transaction, e.g. \&quot;created, \&quot;await_approval\&quot;, \&quot;pending\&quot;, \&quot;prepared\&quot;, \&quot;signed\&quot;, \&quot;broadcasted\&quot;, \&quot;success\&quot;, \&quot;failed\&quot;, \&quot;rejected\&quot;, mined\&quot;. |  |
|**totalAmount** | [**CreateSingleTransactionRequestFromAddressWithoutFeePriorityRITotalAmount**](CreateSingleTransactionRequestFromAddressWithoutFeePriorityRITotalAmount.md) |  |  [optional] |



## Enum: TransactionRequestStatusEnum

| Name | Value |
|---- | -----|
| CREATED | &quot;created&quot; |
| AWAIT_APPROVAL | &quot;await-approval&quot; |
| PENDING | &quot;pending&quot; |
| PREPARED | &quot;prepared&quot; |
| SIGNED | &quot;signed&quot; |
| BROADCASTED | &quot;broadcasted&quot; |
| SUCCESS | &quot;success&quot; |
| FAILED | &quot;failed&quot; |
| REJECTED | &quot;rejected&quot; |
| MINED | &quot;mined&quot; |
| MINED_WITH_ERRORS | &quot;mined-with-errors&quot; |



