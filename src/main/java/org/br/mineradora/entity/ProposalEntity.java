package org.br.mineradora.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Table(name = "proposal")
@Data
@NoArgsConstructor
public class ProposalEntity {

    @Id
    @GeneratedValue
    private Long id;

    private String customer;

    @Column(name = "price_tonne")
    private BigDecimal priceTonne;

    private Integer tonnes;

    private String country;

    @Column(name = "proposal_validity_days")
    private Integer proposalValidityDays;
}
