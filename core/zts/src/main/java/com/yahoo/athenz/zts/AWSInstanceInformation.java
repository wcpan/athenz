//
// This file generated by rdl 1.4.10. Do not modify!
//

package com.yahoo.athenz.zts;
import com.yahoo.rdl.*;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

//
// AWSInstanceInformation - AWSInstanceInformation - the information a booting
// EC2 instance must provide to ZTS to authenticate.
//
@JsonSerialize(include = JsonSerialize.Inclusion.NON_DEFAULT)
public class AWSInstanceInformation {
    public String document;
    public String signature;
    public String domain;
    public String service;
    public String csr;
    @RdlOptional
    public String ssh;
    public String name;
    public String account;
    @RdlOptional
    public String cloud;
    @RdlOptional
    public String subnet;
    public String access;
    public String secret;
    public String token;
    public Timestamp expires;
    public Timestamp modified;
    public String flavor;

    public AWSInstanceInformation setDocument(String document) {
        this.document = document;
        return this;
    }
    public String getDocument() {
        return document;
    }
    public AWSInstanceInformation setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return signature;
    }
    public AWSInstanceInformation setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return domain;
    }
    public AWSInstanceInformation setService(String service) {
        this.service = service;
        return this;
    }
    public String getService() {
        return service;
    }
    public AWSInstanceInformation setCsr(String csr) {
        this.csr = csr;
        return this;
    }
    public String getCsr() {
        return csr;
    }
    public AWSInstanceInformation setSsh(String ssh) {
        this.ssh = ssh;
        return this;
    }
    public String getSsh() {
        return ssh;
    }
    public AWSInstanceInformation setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return name;
    }
    public AWSInstanceInformation setAccount(String account) {
        this.account = account;
        return this;
    }
    public String getAccount() {
        return account;
    }
    public AWSInstanceInformation setCloud(String cloud) {
        this.cloud = cloud;
        return this;
    }
    public String getCloud() {
        return cloud;
    }
    public AWSInstanceInformation setSubnet(String subnet) {
        this.subnet = subnet;
        return this;
    }
    public String getSubnet() {
        return subnet;
    }
    public AWSInstanceInformation setAccess(String access) {
        this.access = access;
        return this;
    }
    public String getAccess() {
        return access;
    }
    public AWSInstanceInformation setSecret(String secret) {
        this.secret = secret;
        return this;
    }
    public String getSecret() {
        return secret;
    }
    public AWSInstanceInformation setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return token;
    }
    public AWSInstanceInformation setExpires(Timestamp expires) {
        this.expires = expires;
        return this;
    }
    public Timestamp getExpires() {
        return expires;
    }
    public AWSInstanceInformation setModified(Timestamp modified) {
        this.modified = modified;
        return this;
    }
    public Timestamp getModified() {
        return modified;
    }
    public AWSInstanceInformation setFlavor(String flavor) {
        this.flavor = flavor;
        return this;
    }
    public String getFlavor() {
        return flavor;
    }

    @Override
    public boolean equals(Object another) {
        if (this != another) {
            if (another == null || another.getClass() != AWSInstanceInformation.class) {
                return false;
            }
            AWSInstanceInformation a = (AWSInstanceInformation) another;
            if (document == null ? a.document != null : !document.equals(a.document)) {
                return false;
            }
            if (signature == null ? a.signature != null : !signature.equals(a.signature)) {
                return false;
            }
            if (domain == null ? a.domain != null : !domain.equals(a.domain)) {
                return false;
            }
            if (service == null ? a.service != null : !service.equals(a.service)) {
                return false;
            }
            if (csr == null ? a.csr != null : !csr.equals(a.csr)) {
                return false;
            }
            if (ssh == null ? a.ssh != null : !ssh.equals(a.ssh)) {
                return false;
            }
            if (name == null ? a.name != null : !name.equals(a.name)) {
                return false;
            }
            if (account == null ? a.account != null : !account.equals(a.account)) {
                return false;
            }
            if (cloud == null ? a.cloud != null : !cloud.equals(a.cloud)) {
                return false;
            }
            if (subnet == null ? a.subnet != null : !subnet.equals(a.subnet)) {
                return false;
            }
            if (access == null ? a.access != null : !access.equals(a.access)) {
                return false;
            }
            if (secret == null ? a.secret != null : !secret.equals(a.secret)) {
                return false;
            }
            if (token == null ? a.token != null : !token.equals(a.token)) {
                return false;
            }
            if (expires == null ? a.expires != null : !expires.equals(a.expires)) {
                return false;
            }
            if (modified == null ? a.modified != null : !modified.equals(a.modified)) {
                return false;
            }
            if (flavor == null ? a.flavor != null : !flavor.equals(a.flavor)) {
                return false;
            }
        }
        return true;
    }
}
