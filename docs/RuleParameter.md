

# RuleParameter


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**businessGoal** | **String** |  |  [optional] |
|**client** | **String** | Client name |  [optional] |
|**dataType** | [**DataTypeEnum**](#DataTypeEnum) | The data type |  [optional] |
|**description** | **String** | Description of the global parameter |  [optional] |
|**globalParam** | **Boolean** |  |  [optional] |
|**isConfidential** | **Boolean** | Value is masked, e.g. for passwords/keys characters (true/false) |  [optional] |
|**isEditable** | **Boolean** | Values can be edited by users without GLOBALPARAMETER_CAN_CONFIGURE permission characters (true/false) |  [optional] |
|**isForcedValue** | **Boolean** | Rule parameter values will be overridden characters (true/false) |  [optional] |
|**isVisible** | **Boolean** | Should display characters (true/false) |  [optional] |
|**name** | **String** | Global param name |  [optional] |
|**picklistItems** | [**List&lt;PickListItem&gt;**](PickListItem.md) | Array of items to select from |  [optional] |
|**requiresAdmin** | **Boolean** |  |  [optional] |
|**targets** | [**List&lt;TargetValue&gt;**](TargetValue.md) | Each target/value |  [optional] |
|**units** | **String** |  |  [optional] |
|**url** | **String** |  |  [optional] |
|**defaultValue** | **String** |  |  [optional] |
|**parameterName** | **String** |  |  [optional] |
|**usingGlobal** | **Boolean** |  |  [optional] |



## Enum: DataTypeEnum

| Name | Value |
|---- | -----|
| STRING | &quot;string&quot; |
| NUMBER | &quot;number&quot; |
| DATE | &quot;date&quot; |
| PICKLIST | &quot;picklist&quot; |
| ORDEREDLIST | &quot;orderedlist&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



