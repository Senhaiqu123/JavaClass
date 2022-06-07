/*import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  template: `<h1>Hello world! {{title}}</h1>
<second-directive  [firstName]="author"></second-directive>`
})
export class AppComponent {
  author ="Joys";
  title = 'myApp';
}
*/


/*
import { Component } from '@angular/core';
import { MyServiceService} from "./my-service.service";

@Component({
  selector: 'app-root',
  template: `<h1>Hello world! {{title}}</h1>
  <ul><li *ngFor="let name of names">{{name}}</li></ul>`,
// 'providers' allows you to create and pass an instance
// of the class to the constructor header.
  providers: [MyServiceService]
})
export class AppComponent {
  public title = 'This is Angular!';
  names: Array<any>;
// Create instance of 'MyDataService' right in the constructor
// header.
  constructor(myDataService: MyServiceService) {
// Use service to call getNames() method.
    this.names = myDataService.getNames();
  }
}  */


/*
import { Component } from '@angular/core';
import { Mydata2Service} from "./mydata2.service";

@Component({
  selector: 'app-root',
  template: `<h1>Hello world! {{title}}</h1>
<ul>{{myname}}</ul>`,
// 'providers' allows you to create and pass an instance
// of the class to the constructor header.
  providers: [Mydata2Service]
})
export class AppComponent {
  public title = 'This is Angular!';
  myname: string;
// Create instance of 'MyDataService' right in the constructor
// header.
  constructor(myDataService: Mydata2Service) {
// Use service to call getNames() method.
    this.myname = myDataService.getmyNames();
  }
} */


/*
import { Component } from '@angular/core';
import { TemperatureServiceService} from "./temperature-service.service";

@Component({
  selector: 'app-root',
  template: `<h1>Hello world! {{title}}</h1>
<ul>{{f}}</ul>`,
// 'providers' allows you to create and pass an instance
// of the class to the constructor header.
  providers: [TemperatureServiceService]
})
export class AppComponent {
  public title = 'This is Angular!';
  f: number;
// Create instance of 'MyDataService' right in the constructor
// header.
  constructor(conversionCtoF: TemperatureServiceService) {
// Use service to call getNames() method.
    this.f = conversionCtoF.getConversion();
  }
} */


/*
import { Component } from '@angular/core';
@Component({
  selector: 'app-root',
  template: `<!-- Sep 17, 2019 -->
{{ mydate | date }}<br>
<!-- Sep 17, 2019 -->
<p>{{ mydate | date: 'y MMMM d' }}<br>
<!-- Sep 17, 2019 -->
<p>{{ mydate | date: 'mediumDate' }}<br>
<!-- Tuesday, Sep 17, 2019 -->
<p>{{ mydate | date: 'fullDate' }}<br>
<!-- 6:00 PM -->
<p>{{ mydate | date: 'shortTime' }}<br>
<!-- TUESDAY, Sep 17, 2019 -->
<p>{{ mydate | date:'fullDate' | uppercase}}</p>
<!-- Sep 17, 2019 6:00PM -->
<p>{{ mydate | date:'MMMM d, y h:mma' }}</p>
`
})
export class AppComponent {
// Months start counting at 0.
  mydate = new Date(2019, 8, 17, 18, 0, 30);
} */



/*
import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  template: `
<!-- Sep 17, 2019 6:00PM -->
<p>{{ mydate | date:'EEEE, MMMM d, y h:mma' }}</p>
`
})
export class AppComponent {
// Months start counting at 0.
  mydate = new Date(2019, 8, 17, 18, 0, 30);
}*/


/*
import { Component } from '@angular/core';
@Component({
  selector: 'app-root',
  template: `
{{price | currency:'USD':true}}<br/>
`,
})
export class AppComponent {
  price: number = 23.23333;
  constructor() {
  }
}*/


/*
import { Component } from '@angular/core';
import { FahrenheitPipe} from "./fahrenheit.pipe";

@Component({
  selector: 'app-root',
  template: `<p>{{celsius | fahrenheit }}</p>`,
})
export class AppComponent {
  celsius: number;

  constructor() {
    this.celsius = 33;
  }
}*/


/*
import { Component } from '@angular/core';
import { PhoneNumberPipe} from "./phone-number.pipe";

@Component({
  selector: 'app-root',
  template: `<p>{{s| phoneNumber }}</p>`,
})
export class AppComponent {
 s: string;

  constructor() {
    this.s = "0123456789";
  }
}*/


/*
import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  template:
    `<h1>This is the header</h1>
<nav>
<a routerLink="/page-a" routerLinkActive="active">A</a> |
<a routerLink="/page-b" routerLinkActive="active">B</a>
</nav>
<!-- Where router should display a view -->
<router-outlet></router-outlet>`
})
export class AppComponent { }
*/



import { Component } from '@angular/core';import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { PageAComponent} from "./page-a/page-a.component";
import { PageBComponent} from "./page-b/page-b.component";
import  {routing} from "./routing";
import {DefaultComponent} from "./default/default.component";

@Component({

  selector: 'app-root',
  template:
    `<h1>This is the header</h1>
<nav>
<a routerLink="/page-a" routerLinkActive="active">A</a> |
  <a routerLink="/page-b/5/bob" routerLinkActive="active">B</a>
</nav>
<!-- Where router should display a view -->
<router-outlet></router-outlet>`
})
export class AppComponent {
  constructor() {
    let str = "This is where the class is initialized.";
    console.log(str);
  }

}


