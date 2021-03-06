
package com.mailjet.api.model.v3.senderstatistics;

import java.util.Date;
import com.mailjet.api.client.MailJetApiService;
import com.mailjet.api.client.model.ResourceOperationTypes;
import com.mailjet.api.client.model.metadata.Component;
import com.mailjet.api.client.model.metadata.Resource;


/**
 * Class representing "API Key sender email address message/open/click statistical information.".
 * 
 * Automatically generated using the MailJet API metadata on Fri Oct 10 15:32:21 CEST 2014.
 * 
 */
@Resource(name = "senderstatistics", description = "API Key sender email address message/open/click statistical information.", allowedOperations = {
    ResourceOperationTypes.Get
}, uniquekey = "Email")
public final class SenderStatistics {

    @Component(name = "BlockedCount", type = "Int64", defaultValue = "", required = false, description = "Number of blocked messages.")
    private Long BlockedCount;
    @Component(name = "BouncedCount", type = "Int64", defaultValue = "", required = false, description = "Number of bounced messages.")
    private Long BouncedCount;
    @Component(name = "ClickedCount", type = "Int64", defaultValue = "", required = false, description = "Number of registered clicks.")
    private Long ClickedCount;
    @Component(name = "DeliveredCount", type = "Int64", defaultValue = "", required = false, description = "Number of messages delivered to their destination.")
    private Long DeliveredCount;
    @Component(name = "LastActivityAt", type = "TRFC3339DateTime", defaultValue = "", required = false, description = "Timestamp of last registered activity for this sender.")
    private Date LastActivityAt;
    @Component(name = "OpenedCount", type = "Int64", defaultValue = "", required = false, description = "Number of message open registrations.")
    private Long OpenedCount;
    @Component(name = "ProcessedCount", type = "Int64", defaultValue = "", required = false, description = "Total number of messages processed by Mailjet.")
    private Long ProcessedCount;
    @Component(name = "QueuedCount", type = "Int64", defaultValue = "", required = false, description = "Number of messages waiting in send queue.")
    private Long QueuedCount;
    @Component(name = "Sender", type = "TSender", defaultValue = "", required = true, description = "Reference to the sender for which the statistics are collected.")
    private Long SenderID;
    @Component(name = "SpamComplaintCount", type = "Int64", defaultValue = "", required = false, description = "Number of spam complaints.")
    private Long SpamComplaintCount;
    @Component(name = "UnsubscribedCount", type = "Int64", defaultValue = "", required = false, description = "Number of registered unsubscribe requests.")
    private Long UnsubscribedCount;
    /**
     * API Operation "List".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.Retrieve<SenderStatistics>> List = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.Retrieve<SenderStatistics>>(SenderStatistics.class, ResourceOperationTypes.Get);

    /**
     * Gets "Number of blocked messages." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getBlockedCount() {
        return BlockedCount;
    }

    /**
     * Sets the specified value to "Number of blocked messages." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public SenderStatistics setBlockedCount(Long value) {
        BlockedCount = value;
        return this;
    }

    /**
     * Gets "Number of bounced messages." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getBouncedCount() {
        return BouncedCount;
    }

    /**
     * Sets the specified value to "Number of bounced messages." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public SenderStatistics setBouncedCount(Long value) {
        BouncedCount = value;
        return this;
    }

    /**
     * Gets "Number of registered clicks." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getClickedCount() {
        return ClickedCount;
    }

    /**
     * Sets the specified value to "Number of registered clicks." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public SenderStatistics setClickedCount(Long value) {
        ClickedCount = value;
        return this;
    }

    /**
     * Gets "Number of messages delivered to their destination." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getDeliveredCount() {
        return DeliveredCount;
    }

    /**
     * Sets the specified value to "Number of messages delivered to their destination." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public SenderStatistics setDeliveredCount(Long value) {
        DeliveredCount = value;
        return this;
    }

    /**
     * Gets "Timestamp of last registered activity for this sender." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Date getLastActivityAt() {
        return LastActivityAt;
    }

    /**
     * Sets the specified value to "Timestamp of last registered activity for this sender." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public SenderStatistics setLastActivityAt(Date value) {
        LastActivityAt = value;
        return this;
    }

    /**
     * Gets "Number of message open registrations." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getOpenedCount() {
        return OpenedCount;
    }

    /**
     * Sets the specified value to "Number of message open registrations." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public SenderStatistics setOpenedCount(Long value) {
        OpenedCount = value;
        return this;
    }

    /**
     * Gets "Total number of messages processed by Mailjet." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getProcessedCount() {
        return ProcessedCount;
    }

    /**
     * Sets the specified value to "Total number of messages processed by Mailjet." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public SenderStatistics setProcessedCount(Long value) {
        ProcessedCount = value;
        return this;
    }

    /**
     * Gets "Number of messages waiting in send queue." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getQueuedCount() {
        return QueuedCount;
    }

    /**
     * Sets the specified value to "Number of messages waiting in send queue." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public SenderStatistics setQueuedCount(Long value) {
        QueuedCount = value;
        return this;
    }

    /**
     * Gets "Reference to the sender for which the statistics are collected." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getSenderID() {
        return SenderID;
    }

    /**
     * Sets the specified value to "Reference to the sender for which the statistics are collected." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public SenderStatistics setSenderID(Long value) {
        SenderID = value;
        return this;
    }

    /**
     * Gets "Number of spam complaints." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getSpamComplaintCount() {
        return SpamComplaintCount;
    }

    /**
     * Sets the specified value to "Number of spam complaints." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public SenderStatistics setSpamComplaintCount(Long value) {
        SpamComplaintCount = value;
        return this;
    }

    /**
     * Gets "Number of registered unsubscribe requests." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getUnsubscribedCount() {
        return UnsubscribedCount;
    }

    /**
     * Sets the specified value to "Number of registered unsubscribe requests." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public SenderStatistics setUnsubscribedCount(Long value) {
        UnsubscribedCount = value;
        return this;
    }

}
