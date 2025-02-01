package org.br.mineradora.service;

import org.br.mineradora.dto.ProposalDetailsDTO;

public interface ProposalService {

    ProposalDetailsDTO findFullProposal(long id);

    void createNewProposal(ProposalDetailsDTO proposalDetailsDTO);

    void removeProposal(long id);
}
