import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AuthserviceService {

  constructor(private http: HttpClient) { }

  addProduct(addproduct): Observable<any> {
    return this.http.post('http://localhost:8080/stockmanagement/add' , addproduct);
  }

  updateProduct(updateproduct): Observable<any> {
    return this.http.put(`http://localhost:8080/stockmanagement/modify/${updateproduct.id}` , updateproduct);
  }

}
