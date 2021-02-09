package org.worldbuild.ecscicd.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class UserResponseDto {

    private int age;
    private String name;
    private String contact;
    private Address address;

    public static UserResponseDto createUser() {
        UserResponseDto user=new UserResponseDto();
        user.setAge(25);
        user.setName("Saurabh Singh");
        user.setContact("+919696848127");
        Address address=new UserResponseDto.Address("10/12, Ramganj","Pratapgarh","UP","230121");
        user.setAddress(address);
        return user;
    }

    @Data
    @AllArgsConstructor
    private static class Address {
        public String area;
        public String district;
        public String state;
        public String pincode;
    }
}
