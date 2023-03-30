//package com.example.sessionauth.session;
//
//import jakarta.persistence.*;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//
//import static jakarta.persistence.FetchType.LAZY;
//
//@Table(name = "SPRING_SESSION_ATTRIBUTES")
//@Entity
//@IdClass(SessionAttributesID.class)
//@NoArgsConstructor
//@Getter
//@Setter
//public class SessionAttributes {
//
//    @Id
//    @Column(name = "SESSION_PRIMARY_ID", length = 36, nullable = false)
//    private String sessionPrimaryId;
//
//    @Id
//    @Column(name = "ATTRIBUTE_NAME", length = 200, nullable = false)
//    private String attributeName;
//
//    @Lob
//    @Column(name = "ATTRIBUTE_BYTES", length = 10000, nullable = false)
//    private byte[] attributeBytes;
//
//    @ManyToOne(fetch = LAZY)
//    @MapsId
//    @JoinColumn(
//            name = "SESSION_PRIMARY_ID",
//            referencedColumnName = "PRIMARY_ID",
//            nullable = false,
//            foreignKey = @ForeignKey(name = "SPRING_SESSION_ATTRIBUTES_FK")
//
//    )
//    private SpringSession springSession;
//
//}