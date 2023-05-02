{
    "Resources": {
        "MyS3Bucket": {
            "Type": "AWS::S3::Bucket",
            "Properties": {
                "BucketName": "my-bucket-name",
                "AccessControl": "Private",
                "VersioningConfiguration": {
                    "Status": "Enabled"
                }
            }
        }
    }
}

