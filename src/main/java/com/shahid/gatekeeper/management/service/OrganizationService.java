package com.shahid.gatekeeper.management.service;

import com.shahid.gatekeeper.management.dto.requestDto.OrganizationRequest;
import com.shahid.gatekeeper.management.dto.responseDto.OrganizationResponse;
import jakarta.validation.Valid;

import java.util.List;

public class OrganizationService {

    public OrganizationResponse create(@Valid OrganizationRequest request) {
    }

    public List<OrganizationResponse> findAll() {
    }

    public OrganizationResponse findById(Long id) {
    }

    public OrganizationResponse update(Long id, @Valid OrganizationRequest request) {
    }

    public OrganizationResponse changeStatus(Long id, @Valid OrganizationRequest request) {
    }

    public void delete(Long id) {
    }
}
