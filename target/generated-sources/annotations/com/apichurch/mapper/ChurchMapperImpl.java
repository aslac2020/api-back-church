package com.apichurch.mapper;

import com.apichurch.dto.ChurchRequest;
import com.apichurch.dto.ChurchResponse;
import com.apichurch.entities.Church;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-12T10:39:14-0300",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 18.0.2 (Oracle Corporation)"
)
@Component
public class ChurchMapperImpl implements ChurchMapper {

    @Override
    public Church toEntity(ChurchRequest request) {
        if ( request == null ) {
            return null;
        }

        Church church = new Church();

        church.setNameCongregation( request.getNameCongregation() );
        church.setSector( request.getSector() );
        church.setRegional( request.getRegional() );
        church.setCnpj( request.getCnpj() );
        church.setCep( request.getCep() );
        church.setUf( request.getUf() );
        church.setAddress( request.getAddress() );
        church.setNeighborhood( request.getNeighborhood() );
        church.setCity( request.getCity() );
        church.setIsRent( request.getIsRent() );

        return church;
    }

    @Override
    public ChurchResponse toResponse(Church church) {
        if ( church == null ) {
            return null;
        }

        ChurchResponse churchResponse = new ChurchResponse();

        churchResponse.setNameCongregation( church.getNameCongregation() );
        churchResponse.setSector( church.getSector() );
        churchResponse.setRegional( church.getRegional() );
        churchResponse.setCnpj( church.getCnpj() );
        churchResponse.setCep( church.getCep() );
        churchResponse.setUf( church.getUf() );
        churchResponse.setAddress( church.getAddress() );
        churchResponse.setNeighborhood( church.getNeighborhood() );
        churchResponse.setCity( church.getCity() );
        churchResponse.setIsRent( church.getIsRent() );

        return churchResponse;
    }
}
