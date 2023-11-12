package com.apichurch.mapper;

import com.apichurch.dto.PersonRequest;
import com.apichurch.dto.PersonResponse;
import com.apichurch.entities.Person;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-12T10:39:13-0300",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 18.0.2 (Oracle Corporation)"
)
@Component
public class PersonMapperImpl implements PersonMapper {

    @Override
    public Person toEntity(PersonRequest request) {
        if ( request == null ) {
            return null;
        }

        Person person = new Person();

        person.setRi( request.getRi() );
        person.setName( request.getName() );
        person.setOffice( request.getOffice() );
        person.setConsecrationDate( request.getConsecrationDate() );
        person.setDateBirth( request.getDateBirth() );
        person.setNaturalness( request.getNaturalness() );
        person.setUf( request.getUf() );
        person.setSex( request.getSex() );
        person.setCep( request.getCep() );
        person.setAddress( request.getAddress() );
        person.setNeighborhood( request.getNeighborhood() );
        person.setCity( request.getCity() );
        person.setFoneRes( request.getFoneRes() );
        person.setFoneCel( request.getFoneCel() );
        person.setEmail( request.getEmail() );
        person.setMaritalStatus( request.getMaritalStatus() );
        person.setDateWedding( request.getDateWedding() );
        person.setProfession( request.getProfession() );
        person.setCpf( request.getCpf() );
        person.setRg( request.getRg() );
        person.setBaptizedHe( request.getBaptizedHe() );
        person.setDateBaptizedHe( request.getDateBaptizedHe() );
        person.setDateBaptized( request.getDateBaptized() );
        person.setChurch( request.getChurch() );
        person.setDateAdmission( request.getDateAdmission() );
        person.setNameSpouse( request.getNameSpouse() );
        person.setChildren( request.getChildren() );
        person.setDateConversion( request.getDateConversion() );
        person.setChurchOrigin( request.getChurchOrigin() );
        person.setChurchOriginCity( request.getChurchOriginCity() );
        person.setChurchOrigiNCity_uf( request.getChurchOrigiNCity_uf() );

        return person;
    }

    @Override
    public PersonResponse toResponse(Person person) {
        if ( person == null ) {
            return null;
        }

        PersonResponse personResponse = new PersonResponse();

        personResponse.setRi( person.getRi() );
        personResponse.setName( person.getName() );
        personResponse.setOffice( person.getOffice() );
        personResponse.setConsecrationDate( person.getConsecrationDate() );
        personResponse.setDateBirth( person.getDateBirth() );
        personResponse.setNaturalness( person.getNaturalness() );
        personResponse.setUf( person.getUf() );
        personResponse.setSex( person.getSex() );
        personResponse.setCep( person.getCep() );
        personResponse.setAddress( person.getAddress() );
        personResponse.setNeighborhood( person.getNeighborhood() );
        personResponse.setCity( person.getCity() );
        personResponse.setFoneRes( person.getFoneRes() );
        personResponse.setFoneCel( person.getFoneCel() );
        personResponse.setEmail( person.getEmail() );
        personResponse.setMaritalStatus( person.getMaritalStatus() );
        personResponse.setDateWedding( person.getDateWedding() );
        personResponse.setProfession( person.getProfession() );
        personResponse.setCpf( person.getCpf() );
        personResponse.setRg( person.getRg() );
        personResponse.setBaptizedHe( person.getBaptizedHe() );
        personResponse.setDateBaptizedHe( person.getDateBaptizedHe() );
        personResponse.setDateBaptized( person.getDateBaptized() );
        personResponse.setChurch( person.getChurch() );
        personResponse.setDateAdmission( person.getDateAdmission() );
        personResponse.setNameSpouse( person.getNameSpouse() );
        personResponse.setChildren( person.getChildren() );
        personResponse.setDateConversion( person.getDateConversion() );
        personResponse.setChurchOrigin( person.getChurchOrigin() );
        personResponse.setChurchOriginCity( person.getChurchOriginCity() );
        personResponse.setChurchOrigiNCity_uf( person.getChurchOrigiNCity_uf() );

        return personResponse;
    }
}
