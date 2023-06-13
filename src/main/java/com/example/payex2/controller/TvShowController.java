package com.example.payex2.controller;

import com.example.payex2.dto.TvShowDto;
import com.example.payex2.input.TvShowInput;
import com.example.payex2.model.TvShow;
import com.example.payex2.service.TvShowService;
import com.example.payex2.utils.ErrorMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("TvShow")
@CrossOrigin
public class TvShowController {

    @Autowired
    private TvShowService tvShowService;

    @PostMapping(value = "save")
    public ResponseEntity save(@RequestBody TvShowInput tvShowInput) throws Exception {

        return ResponseEntity.status(HttpStatus.CREATED).body(this.tvShowService.createTvShow(tvShowInput));
    }



    @RequestMapping(value = "/findAllTvShows", method = RequestMethod.GET)
    public ResponseEntity<TvShow> findAllTvShows(){
        return new ResponseEntity(tvShowService.findAllTvShows().stream(),HttpStatus.OK);
    }

    @GetMapping(value = "/findById")
    public ResponseEntity<TvShow> findById(@RequestParam(value="id") Long id) throws Exception {
        return new ResponseEntity<>(tvShowService.getOneId(id),HttpStatus.OK);
    }


    @PutMapping(value = "updateTvShow")
    public ResponseEntity<TvShow> updateTvShow(@RequestBody TvShowDto tvShowDto)throws Exception {
        return new ResponseEntity<>(tvShowService.updateTvShow(tvShowDto),HttpStatus.OK);
    }

    @DeleteMapping(value = "deleteTvShow/{id}")
    public ResponseEntity<HttpStatus> deleteTvShow(@PathVariable Long id) {
        tvShowService.deleteTvShow( id) ;
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
