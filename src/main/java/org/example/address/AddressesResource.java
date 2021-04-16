package org.example.address;

import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import org.example.address.beans.Address;

/**
 * A JAX-RS interface.  An implementation of this interface must be provided.
 */
@Path("/addresses")
public interface AddressesResource {
  @GET
  @Produces("application/json")
  List<Address> getListOfAddresses();

  @POST
  @Consumes("application/json")
  void creatingANewAddress(Address data);

  @Path("/{addressId}")
  @GET
  @Produces("application/json")
  Address getAddressById(@PathParam("addressId") String addressId);

  @Path("/{addressId}")
  @PUT
  @Consumes("application/json")
  void updateAddress(@PathParam("addressId") String addressId, Address data);

  @Path("/{addressId}")
  @DELETE
  void deleteAddressById(@PathParam("addressId") String addressId);
}
