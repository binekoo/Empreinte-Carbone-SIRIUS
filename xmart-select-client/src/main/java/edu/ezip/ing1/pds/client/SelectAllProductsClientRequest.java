package edu.ezip.ing1.pds.client;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.ezip.ing1.pds.business.dto.Produits;
import edu.ezip.ing1.pds.client.commons.ClientRequest;
import edu.ezip.ing1.pds.client.commons.NetworkConfig;
import edu.ezip.ing1.pds.commons.Request;

import java.io.IOException;

public class SelectAllProductsClientRequest extends ClientRequest<Object, Produits> {

    public SelectAllProductsClientRequest(
            NetworkConfig networkConfig, int myBirthDate, Request request, Object info, byte[] bytes)
            throws IOException {
        super(networkConfig, myBirthDate, request, info, bytes);
    }

    @Override
    public Produits readResult(String body) throws IOException {
        final ObjectMapper mapper = new ObjectMapper();
        final Produits produits = mapper.readValue(body, Produits.class);
        return produits;
    }
}
