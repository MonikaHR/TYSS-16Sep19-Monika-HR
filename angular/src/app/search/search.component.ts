import { Component, OnInit } from '@angular/core';
import { AuthserviceService } from '../authservice.service';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-search',
  templateUrl: './search.component.html',
  styleUrls: ['./search.component.css']
})
export class SearchComponent implements OnInit {
  products;
  inputData: any;
  constructor(private auth: AuthserviceService, private http: HttpClient) { }

  ngOnInit() {
  }

  search(event) {
    this.inputData = event.target.value;
  }

  searchByName(product) {
    this.http.get<any>(`http://localhost:8080/stockmanagement/${product.id}`, product).subscribe(response => {
      console.log(response);
    }, err => {
      console.log(err);
    }
    );
  }



}
