package org.br.mineradora.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
public class ProposalDTO {

    private Long proposalId;
    private String customer;
    private BigDecimal priceTonne;
}
