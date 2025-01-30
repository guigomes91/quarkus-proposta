package org.br.mineradora.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

import java.math.BigDecimal;
import java.util.Date;

@Jacksonized
@Data
@Builder
@AllArgsConstructor
public class ProposalDetailsDTO {

    private Long proposalId;
    private String customer;

    @Column(name = "price_tonne")
    private BigDecimal priceTonne;
    private Integer tonnes;
    private String country;

    @Column(name = "proposal_validity_days")
    private Integer proposalValidityDays;

    private Date created;
}
