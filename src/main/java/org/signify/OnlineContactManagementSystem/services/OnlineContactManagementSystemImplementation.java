package org.signify.OnlineContactManagementSystem.services;

import org.signify.OnlineContactManagementSystem.entity.OnlineContactManagementSystem;
import org.signify.OnlineContactManagementSystem.repository.OnlineContactManagementSystemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;
@Service
public class OnlineContactManagementSystemImplementation implements OnlineContactManagementSystemService{
    @Autowired
    private OnlineContactManagementSystemRepository onlineContactManagementSystemRepository;
    @Override
    public OnlineContactManagementSystem saveContactDetail(OnlineContactManagementSystem onlineContactManagementSystem) {
        return onlineContactManagementSystemRepository.save(onlineContactManagementSystem);
    }

    @Override
    public OnlineContactManagementSystem getContactDetailById(long userId) {
        return onlineContactManagementSystemRepository.findById(userId).get();
    }

    @Override
    public void deleteContactDetailById(long userId) {
        onlineContactManagementSystemRepository.deleteById(userId);
    }

    @Override
    public OnlineContactManagementSystem updateContactDetail(long userId, OnlineContactManagementSystem onlineContactManagementSystem) {
        OnlineContactManagementSystem contactDB = onlineContactManagementSystemRepository.findById(userId).get();
        if (Objects.nonNull(onlineContactManagementSystem.getName()) && !"".equalsIgnoreCase(onlineContactManagementSystem.getName())) {
            contactDB.setName(onlineContactManagementSystem.getName());
        }
//        if (Objects.nonNull(onlineContactManagementSystem.getPhoneNumber()) && !"".equals(onlineContactManagementSystem.getPhoneNumber())) {
//            contactDB.setPhoneNumber(onlineContactManagementSystem.getPhoneNumber());
//        }
        if (Objects.nonNull(onlineContactManagementSystem.getEmail()) && !"".equalsIgnoreCase(onlineContactManagementSystem.getEmail())) {
            contactDB.setEmail(onlineContactManagementSystem.getEmail());
        }

        return onlineContactManagementSystemRepository.save(contactDB);
    }

}
