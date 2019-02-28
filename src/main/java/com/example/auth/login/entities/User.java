package com.example.auth.login.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;
import org.springframework.data.cassandra.core.cql.Ordering;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.UUID;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Table("user")
public class User implements Serializable {
    @Id
    @PrimaryKeyColumn(name = "id", ordinal = 1, ordering = Ordering.DESCENDING, type = PrimaryKeyType.PARTITIONED)
    private UUID id;

    @Column("lastname")
    private String lastName;

    @Column ("firstname")
    private String firstName;

    @Column ("username")
    private String userName;

    @Column ("password")
    private String password;

}
