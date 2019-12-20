import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-viewall',
  templateUrl: './viewall.component.html',
  styleUrls: ['./viewall.component.css']
})
export class ViewallComponent implements OnInit {

  list: any;

  constructor(private http: HttpClient) {
    http.get<any>('http://localhost:8080/stockmanagement/all').subscribe(response => {
       console.log(response);
       this.list = response.beans;
    }, err => {
      console.log(err);
    }
    );
  }


  ngOnInit() {
  }

}
