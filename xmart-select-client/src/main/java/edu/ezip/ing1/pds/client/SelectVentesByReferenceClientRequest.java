package edu.ezip.ing1.pds.client;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.ezip.ing1.pds.business.dto.Ventes;
import edu.ezip.ing1.pds.client.commons.ClientRequest;
import edu.ezip.ing1.pds.client.commons.NetworkConfig;
import edu.ezip.ing1.pds.commons.Request;

import java.io.IOException;

public class SelectVentesByReferenceClientRequest extends ClientRequest<Object, Ventes> {

    public SelectVentesByReferenceClientRequest(
            NetworkConfig networkConfig, int myBirthDate, Request request, Object info, byte[] bytes)
            throws IOException {
        super(networkConfig, myBirthDate, request, info, bytes);
    }

    @Override
    public Ventes readResult(String body) throws IOException {
        final ObjectMapper mapper = new ObjectMapper();
        final Ventes ventes = mapper.readValue(body, Ventes.class);
        return ventes;
    }
}
