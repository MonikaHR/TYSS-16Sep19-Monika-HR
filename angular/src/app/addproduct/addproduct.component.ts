import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';
import { AuthserviceService } from '../authservice.service';

@Component({
  selector: 'app-addproduct',
  templateUrl: './addproduct.component.html',
  styleUrls: ['./addproduct.component.css']
})
export class AddproductComponent implements OnInit {

  error: string;
  constructor(private auth: AuthserviceService, private router: Router) { }

  message: string;
  errr: string;
  addproductData(forms: NgForm) {
    console.log(forms.value);


    this.auth.addProduct(forms.value).subscribe(data => {
      console.log('Response from addProduct', data);
      if (data && data.message === 'added') {
        localStorage.setItem('productDetails', JSON.stringify(data));
        this.router.navigateByUrl('manager');
      } else {
        this.message = JSON.stringify(data.message);
      }
      forms.reset();
    }, err => {
      console.log(err);
      this.error = err.error.message;

    });
  }

  ngOnInit() {
  }

}
