package com.eventostec.api.domain.event;

import com.eventostec.api.domain.address.Address;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.UUID;

@Table(name = "event")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Event {

    @Id
    @GeneratedValue
    private UUID id;
    private String title;
    private String description;
    private String eventUrl;
    private String imgUrl;
    private Boolean remote;
    private Date dataEvent;

    @OneToOne(mappedBy = "event", cascade = CascadeType.ALL)
    private Address address;
}
