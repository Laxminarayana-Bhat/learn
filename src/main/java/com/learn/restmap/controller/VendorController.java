package com.learn.restmap.controller;

import com.learn.restmap.model.VendorDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/vendor")
public class VendorController {
    VendorDto vendorDto = new VendorDto();

    @GetMapping("/get")
    public VendorDto getAllVendors() {
        return vendorDto;
    }

    @PostMapping("/post")
    public String createVendor(@RequestBody VendorDto vendor) {
        this.vendorDto = vendor;
        return "Successfully added:- " + vendor.getVendorName();
    }

    @PutMapping("/put")
    public String modifyVendor(@RequestBody VendorDto vendor) {
        this.vendorDto = vendor;
        return "updated :- " + vendor.getVendorName();
    }

    @DeleteMapping("/delete/{id}")
    public String deleteVendor(@PathVariable String id) {
        this.vendorDto = new VendorDto();
        return "deleted id: " + id;
    }
}
