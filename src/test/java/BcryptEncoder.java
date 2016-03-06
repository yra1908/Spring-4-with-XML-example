import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BcryptEncoder {

    @Test
    public void test() {
        String pass = "admin";
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        System.out.println(encoder.encode(pass));
    }

}

/*create table permissions (
        username varchar(50) not null,
        target varchar(50) not null,
        permission varchar(50) not null,
        constraint fk_permissions_users foreign key(username) references users(username));
        
    create unique index ix_perm_username on permissions (username, target, permission);

    create table users(username varchar(50) not null primary key,
        password varchar(60) not null,
        enabled boolean not null);
        
    create table authorities (
        username varchar(50) not null,
        authority varchar(50) not null,
        constraint fk_authorities_users
        foreign key(username) references users(username));
        
    create unique index ix_auth_username on authorities (username, authority);

    insert into permissions(username, target, permission)
        values ("admin", "com.example.model.Event", "createEvent");*/
