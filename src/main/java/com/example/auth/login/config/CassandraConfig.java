//package com.example.auth.login.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.cassandra.config.AbstractCassandraConfiguration;
//import org.springframework.data.cassandra.config.CassandraClusterFactoryBean;
//import org.springframework.data.cassandra.core.mapping.BasicCassandraMappingContext;
//import org.springframework.data.cassandra.core.mapping.CassandraMappingContext;
//import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;
//
//@Configuration
//@EnableCassandraRepositories(
//        basePackages = "com.example.auth.login.repositories")
//public class CassandraConfig extends AbstractCassandraConfiguration {
//    @Override
//    protected String getKeyspaceName() {
//        return "demo";
//    }
//
////    @Override
////    protected String getKeyspaceName() {
////        return "demo";
////    }
////
////    @Bean
////    public CassandraClusterFactoryBean cluster() {
////        CassandraClusterFactoryBean cluster =
////                new CassandraClusterFactoryBean();
////        cluster.setContactPoints("127.0.0.1");
////        cluster.setPort(9042);
////        return cluster;
////    }
////
////    @Bean
////    public CassandraMappingContext cassandraMapping()
////            throws ClassNotFoundException {
////        return new BasicCassandraMappingContext();
////    }
//}