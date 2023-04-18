package com.myorg;


import org.jetbrains.annotations.Nullable;
import software.amazon.awscdk.Stack;
import software.amazon.awscdk.StackProps;
import software.amazon.awscdk.services.ec2.Vpc;
import software.constructs.Construct;

public class VpcStack extends Stack {

    private Vpc vpc;

    public VpcStack(@Nullable Construct scope, @Nullable String id) {
        this(scope, id, null);
    }

    public VpcStack(@Nullable Construct scope, @Nullable String id, @Nullable StackProps props) {
        super(scope, id, props);

        vpc = Vpc.Builder.create(this, "Vpc01")
                .maxAzs(2)
                .natGateways(0)
                .build();
    }

    public Vpc getVpc() {
        return vpc;
    }
}
