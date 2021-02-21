package com.guner.hazelcast;

import com.hazelcast.config.Config;
import com.hazelcast.config.JoinConfig;
import com.hazelcast.config.ManagementCenterConfig;
import com.hazelcast.config.NetworkConfig;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;

import java.util.Map;

public class HazelcastServer {

    private static HazelcastInstance hazelcastInstance;

    public static void main(String[] args) {

        HazelcastServer hazelcastServer = new HazelcastServer();
        hazelcastServer.initialize();
        hazelcastServer.setAndGetValue();

    }

    private void setAndGetValue() {
        Map<String, String> dataMap = hazelcastInstance.getMap("deneme-data");
        dataMap.put("list1", "value1--"+hazelcastInstance.getLocalEndpoint());

        String list1Value = dataMap.get("list1");

        System.out.printf("List1 --> " + list1Value);

    }

    private static void initialize() {
        Config config = new Config();
        NetworkConfig network = config.getNetworkConfig();
        network.setPort(5701).setPortCount(20);
        network.setPortAutoIncrement(true);
        JoinConfig join = network.getJoin();
        join.getMulticastConfig().setEnabled(false);
        join.getTcpIpConfig()
                .addMember("guner")
                .addMember("localhost").setEnabled(true);

        hazelcastInstance = Hazelcast.newHazelcastInstance();
    }
}
