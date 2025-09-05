package com.visionrent.mapper;

import com.visionrent.domain.ContactMessage;
import com.visionrent.dto.ContactMessageDTO;
import com.visionrent.dto.request.ContactMessageRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring") // Herhangi bir sınıf enjekte edip kullanabilirim.
public interface ContactMessageMapper {

    // ContactMessage ----> ContactMessageDTO
    ContactMessageDTO contactMessageToDTO(ContactMessage contactMessage);

    /*
    * contactMessageDTO.name = contactMessage.name;
    * contactMessageDTO.subject = contactMessage.subject;
    */

    // ContactMessageRequest ----> ContactMessage
    @Mapping(target = "id", ignore = true) // Targettaki id fieldini mapleme
    ContactMessage contactMessageRequestToContactMessage(ContactMessageRequest contactMessageRequest);

    // List<ContactMessage> ----> List<ContactMessageDTO>
    List<ContactMessageDTO> map(List<ContactMessage> contactMessageList);

}
