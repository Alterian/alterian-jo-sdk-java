

# LicenseData


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Name of the license |  |
|**client** | **String** | Name of the license client |  |
|**hasAvailableQuota** | **Boolean** | Has available quota remaining |  [optional] |
|**startDate** | **OffsetDateTime** | Start date of the license |  |
|**endDate** | **OffsetDateTime** | End date of the license |  [optional] |
|**conversationQuotaUsed** | **Integer** | Current conversation quota used |  |
|**conversationQuota** | **Integer** | Conversation quota |  |
|**blockOverage** | **Boolean** | Does this license block overage once quota has been reached? |  |
|**quotaUsageHistory** | [**List&lt;QuotaUsageHistory&gt;**](QuotaUsageHistory.md) | History of quota usage |  [optional] |
|**signature** | **String** | License signature |  [optional] |
|**isActive** | **Boolean** |  |  |



