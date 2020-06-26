package guru.springfamework.api.v1.mapper;

import guru.springfamework.api.v1.model.VendorDTO;
import guru.springfamework.domain.Vendor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class VendorMapperTest {

    public static final String NAME = "Udayanga";

    VendorMapper vendorMapper = VendorMapper.INSTANCE;

    @Test
    void vendorToVendorDto() {
        //given
        Vendor vendor = new Vendor();
        vendor.setName(NAME);

        //when
        VendorDTO vendorDTO = vendorMapper.vendorToVendorDto(vendor);

        //then
        assertEquals(vendor.getName(), vendorDTO.getName());
    }

    @Test
    void vendorDtoToVendor() {
        //given
        VendorDTO vendorDTO = new VendorDTO();
        vendorDTO.setName(NAME);

        //when
        Vendor vendor = vendorMapper.vendorDtoToVendor(vendorDTO);

        //then
        assertEquals(vendorDTO.getName(), vendor.getName());
    }
}