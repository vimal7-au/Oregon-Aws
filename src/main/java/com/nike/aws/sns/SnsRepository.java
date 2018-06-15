package com.nike.aws.sns;

import com.amazonaws.services.sns.model.PublishRequest;
import com.amazonaws.services.sns.model.PublishResult;

public class SnsRepository extends SnsBaseRepository {

    public SnsRepository() {
        super();
    }

    public void publish() {
        String topicArn = "";
        String message = "";
        PublishRequest publishRequest = new PublishRequest(topicArn, message);
        PublishResult publishResult = amazonSNSClient.publish(publishRequest);

    }

}
