import { Component, OnInit } from '@angular/core';
import { AuthserviceService } from '../authservice.service';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-modify',
  templateUrl: './modify.component.html',
  styleUrls: ['./modify.component.css']
})
export class ModifyComponent implements OnInit {

  error: string;
  constructor(private auth: AuthserviceService, private router: Router) { }

  modifyproductData(forms: NgForm) {
    console.log(forms.value);


    this.auth.updateProduct(forms.value).subscribe(data => {
      console.log('Response from addAsset', data);
      if (data && data.message === 'updated') {
        localStorage.setItem('updateDetails', JSON.stringify(data));
        this.router.navigateByUrl('manager');
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
