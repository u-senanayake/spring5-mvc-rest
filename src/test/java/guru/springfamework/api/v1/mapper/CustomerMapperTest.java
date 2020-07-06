package guru.springfamework.api.v1.mapper;

import guru.springfamework.api.v1.model.CategoryDTO;
import guru.springfamework.api.v1.model.CustomerDTO;
import guru.springfamework.domain.Category;
import guru.springfamework.domain.Customer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class CustomerMapperTest {

    public static final String FIRST_NAME = "Udayanga";
    public static final String LAST_NAME = "Senanayake";
    public static final long ID = 1L;

    CustomerMapper customerMapper = CustomerMapper.INSTANCE;

//    @Test
//    void customerToCustomerDTO() {
//        //given
//        Customer customer = new Customer();
//        customer.setFirstName(FIRST_NAME);
//        customer.setLastName(LAST_NAME);
//        customer.setId(ID);
//
//        //when
//        CustomerDTO customerDTO = customerMapper.customerToCustomerDTO(customer);
//
//        //then
//        assertEquals(Long.valueOf(ID), customerDTO.getId());
//        assertEquals(FIRST_NAME, customerDTO.getFirstName());
//        assertEquals(LAST_NAME, customerDTO.getLastName());
//        assertEquals("/api/v1/customers/" + customerDTO.getId(), customerDTO.getCustomerUrl());

//    }
}