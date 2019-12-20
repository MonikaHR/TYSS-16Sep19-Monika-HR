import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';


import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { HeaderComponent } from './header/header.component';
import { RouterModule } from '@angular/router';
import { StockmanagerComponent } from './stockmanager/stockmanager.component';
import { AddproductComponent } from './addproduct/addproduct.component';
import { ModifyComponent } from './modify/modify.component';
import { SearchComponent } from './search/search.component';
import { ViewallComponent } from './viewall/viewall.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    HeaderComponent,
    StockmanagerComponent,
    AddproductComponent,
    ModifyComponent,
    SearchComponent,
    ViewallComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule,
    RouterModule.forRoot([
      { path: '', component: HomeComponent },
      { path: 'manager', component: StockmanagerComponent},
      {path : 'addproduct', component: AddproductComponent},
      {path : 'modify', component: ModifyComponent},
      {path : 'search', component: SearchComponent},
      {path : 'viewall', component: ViewallComponent}
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
