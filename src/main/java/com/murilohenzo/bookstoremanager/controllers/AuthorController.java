package com.murilohenzo.bookstoremanager.controllers;

import com.murilohenzo.bookstoremanager.dtos.AuthorDTO;
import com.murilohenzo.bookstoremanager.entities.Author;
import com.murilohenzo.bookstoremanager.services.AuthorService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Api(tags = "Authors")
@RestController
@RequestMapping("api/v1/authors")
public class AuthorController {
    private final AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @ApiOperation(value = "Create author", notes = "This method creates a new author")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Success author creation"),
            @ApiResponse(code = 400, message = "Missing required fields, wrong field range value or author already existing on system."),
    })
    public AuthorDTO create(@RequestBody  @Valid AuthorDTO authorDTO) {
        return authorService.create(authorDTO);
    }
    
    @GetMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    @ApiOperation(value = "Find author by Id", notes = "This method find a author")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success author found"),
            @ApiResponse(code = 400, message = "Missing required params id, wrong id range value or author not existing on system."),
    })
    public AuthorDTO findById(@RequestParam @Valid Long id) { return authorService.findById(id); }
}
