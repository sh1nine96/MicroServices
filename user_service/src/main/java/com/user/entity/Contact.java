package com.user.entity;

public class Contact {
    private Long contactId;
    private String contactName;
    private String contactEmail;
    private Long userId;

    public Contact(Long contactId, String contactName, String contactEmail, Long userId) {
        this.contactId = contactId;
        this.contactName = contactName;
        this.contactEmail = contactEmail;
        this.userId = userId;
    }

    public Contact() {
    }

    public Long getContactId() {
        return contactId;
    }

    public void setContactId(Long contactId) {
        this.contactId = contactId;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
