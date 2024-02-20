package org.signify.OnlineContactManagementSystem.services;

import org.signify.OnlineContactManagementSystem.entity.OnlineContactManagementSystem;
import org.springframework.stereotype.Service;

public interface OnlineContactManagementSystemService {
    OnlineContactManagementSystem saveContactDetail(OnlineContactManagementSystem onlineContactManagementSystem);

    OnlineContactManagementSystem getContactDetailById(long userId);

    void deleteContactDetailById(long userId);

    OnlineContactManagementSystem updateContactDetail(long userId, OnlineContactManagementSystem onlineContactManagementSystem);
}
