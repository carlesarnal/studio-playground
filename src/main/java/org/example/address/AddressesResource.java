package org.example.address;

import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import org.example.address.beans.Address;

/**
 * A JAX-RS interface.  An implementation of this interface must be provided.
 */
@Path("/addresses")
public interface AddressesResource {
  @GET
  @Produces("application/json")
  List<Address> listOfAllAddress();

  @Path("/{addressId}")
  @GET
  @Produces("application/json")
  Address returnAddressById(@PathParam("addressId") Integer addressId);

  @Path("/{addressId}")
  @POST
  @Produces("application/json")
  @Consumes("application/json")
  String createNewAddress(@PathParam("addressId") Integer addressId, Address data);

  @Path("/{addressId}")
  @DELETE
  @Produces("application/json")
  Response deleteAddressById(@PathParam("addressId") Integer addressId);
}
