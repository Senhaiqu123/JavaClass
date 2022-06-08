/*import { Component } from '@angular/core';

export class PlayingCard {
  cardVal: string;
  suit: string;
}

@Component({
  selector: 'app-root',
  // Multi-line content allowed with back ticks.
  template: `<h1>Hello world! {{title}} <br/>
 {{card.cardVal}} of {{card.suit}} <br/>
 {{card1.cardVal}} of {{card1.suit}}.</h1>
 Card: <input [(ngModel)]="card.cardVal">`
})

export class AppComponent {
  title = 'homework9';
  // Declare a PlayingCard object.
  card: PlayingCard = {
    cardVal: "Ace",
    suit: "Spades"
  };
  card1: PlayingCard = {
    cardVal: "Queen",
    suit: "Diamonds"
  };
}*/


/*
import { Component } from '@angular/core';
export class PlayingCard {
  cardVal: string;
  suit: string;
}
@Component({
  selector: 'app-root',
  // Multi-line content allowed with back ticks.
  template: `<h1>Hello world! {{title}} <br/>
 {{card.cardVal}} of {{card.suit}}.</h1>
 Card: <input [(ngModel)]="card.cardVal">`
})
export class AppComponent {
  title = 'This is Angular!';
  // Declare a PlayingCard object.
  card: PlayingCard = {
    cardVal: "Ace",
    suit: "Spades"
  }
}*/

/*
import { Component } from '@angular/core';
export class PlayingCard {
  cardVal: string;
  suit: string;
}
@Component({
  selector: 'app-root',
  // Multi-line content allowed with back ticks.
  template: `<h1>Hello world! {{title}} <br/>
 {{card.cardVal}} of {{card.suit}} <br/>
 {{card1.cardVal}} of {{card1.suit}}.</h1>
 Card: <input [(ngModel)]="card.cardVal">`
})
export class AppComponent {
  title = 'This is Angular!';
  // Declare a PlayingCard object.
  card: PlayingCard = {
    cardVal: "Ace",
    suit: "Spades"
  };
  card1: PlayingCard = {
    cardVal: "Queen",
    suit: "Diamonds"
  };
}*/


/*
import { Component } from '@angular/core';
export class PlayingCard {
  cardVal: string;
  suit: string;
}
@Component({
  selector: 'app-root',
  // Multi-line content allowed with back ticks.
  template: `<h1>Hello world! {{title}} </h1><br/>
 <!-- Show cards in unordered list. -->
 <ul><li *ngFor="let card of cards">{{card.cardVal}}</li></ul>`
})
export class AppComponent {
  title = 'This is Angular!';

  // Include card data in collection.
  cards:PlayingCard[] = [
    { cardVal: "Ace", suit: "Spades" },
    { cardVal: "Two", suit: "Clubs" },
    { cardVal: "Six", suit: "Hearts" },
  ];
}*/

/*
import { Component } from '@angular/core';
export class PlayingCard {
  cardVal: string;
  suit: string;
}
@Component({
  selector: 'app-root',
  // Multi-line content allowed with back ticks.
  template: `<h1>Hello world! {{title}} </h1> <br/>
 <!-- Show cards in unordered list. -->
 <table>
 <tr *ngFor="let card of cards">
 <td> <ul> <li> {{card.cardVal}} </li> </ul> </td>
 <td> <ul> <li> {{card.suit}} </li> </ul> </td>
 </tr>
 </table>`
})
export class AppComponent {
  title = 'This is Angular!';
  // Include card data in collection.
  cards:PlayingCard[] = [ { cardVal: "Ace", suit: "Spades" },
    { cardVal: "Two", suit: "Clubs" },
    { cardVal: "Six", suit: "Hearts" },
  ];
}*/

/*
import { Component } from '@angular/core';
@Component({
  selector: 'app-root',
  template: `
<ul *ngFor="let item of firstNames; let i = index">
  <li>{{"Item"+ i+":"+item}}</li>

</ul>
 `,
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  firstNames = ['abe', 'amy', 'al'];
}*/


/*
import { Component } from '@angular/core';
@Component({
  selector: 'app-root',
// Multi-line content allowed with back ticks
  template: `<input [(ngModel)]="myinput">
 <input type='button' (click)=doSomething(myinput)>
 {{myoutput}} <br>
 <input [(ngModel)]="myinput1">
 <input type='button' (click)=doSomething1(myinput1)>
 {{myoutput1}}`
})
export class AppComponent {
  myinput = '';
  myoutput = '';
  myinput1 = '';
  myoutput1 = '';
  doSomething(someContent: string) {
    alert(someContent);
    this.myoutput = someContent;
  }
  doSomething1(someContent: string) {
    alert(someContent);
    this.myoutput1 = someContent;
  }
}*/


/*
import { Component } from '@angular/core';
export class PlayingCard {
  cardVal: string;
  suit: string;
}
@Component({
  selector: 'app-root',
// Multi-line content allowed with back ticks.
  template: `<h1>Hello world! {{title}} </h1> <br/>
 <!-- Show cards in unordered list. -->
 <ul><li *ngFor="let card of cards" (click)="onSelect(card)">
 {{card.cardVal}}</li>
 </ul>
 <div *ngIf="selectedCard">
 <h2>{{selectedCard.cardVal}} **</h2>
 <input [(ngModel)]="selectedCard.cardVal" placeholder="name"/>
 </div>
 `
})
export class AppComponent {
  title = 'This is Angular!';
  // Include card data in class.
  cards:PlayingCard[] = [
    { cardVal:"Ace", suit:"Spades"},
    { cardVal:"Two", suit:"Clubs" },
    { cardVal:"Six", suit:"Hearts"},
  ];
  selectedCard: PlayingCard;

  onSelect(card: PlayingCard) {
    this.selectedCard = card;
  }
}*/


/*
import { Component } from '@angular/core';
export class PlayingCard {
  cardVal: string;
  suit: string;
}
@Component({
  selector: 'app-root',
  // Multi-line content allowed with back ticks.
  template: `<h1>Hello world! {{title}} </h1><br/>
 <!-- Show cards in unordered list. -->
 <ul><li *ngFor="let card of cards" (click)="onSelect(card)">
 {{card.cardVal}}</li>
 </ul>
 <div *ngIf="selectedCard">
 <h2>{{selectedCard.cardVal}} **</h2>
 <input [(ngModel)]="selectedCard.cardVal" placeholder="name"/>
 </div>
 `
})
export class AppComponent {
  title = 'This is Angular!';
  // Include card data in class.
  cards: PlayingCard[] = [
    {cardVal: "Ace", suit: "Spades"},
    {cardVal: "Two", suit: "Clubs"},
    {cardVal: "Six", suit: "Hearts"},
  ];
  selectedCard: PlayingCard;

  onSelect(card: PlayingCard) {
    alert(card.suit);
    this.selectedCard = card;
  }
}*/

/*
import { Component } from '@angular/core';
@Component({
  selector: 'app-root',
  template:
    `
<section>
<form #myForm="ngForm">
Name:
<input type="text" pattern="[a-zA-Z ]*" minlength="3" required
[(ngModel)]="myName" name="firstName" #firstName="ngModel" >
<div [hidden]="firstName.valid || firstName.pristine">
This control is invalid.</div>
<p *ngIf="firstName?.errors?.['required']">This field is required.</p>
<p *ngIf="firstName?.errors?.['pattern']">
Only alphabetical characters are allowed.</p>
<p *ngIf="firstName?.errors?.['minlength']">
This entry must have at least three characters.</p>
<button type="submit" class="btn btn-default"
[disabled]="!myForm.form.valid" (click)="onSubmit()">Submit</button>
</form>
</section>
`
})
export class AppComponent {
  myName: string;
  constructor() {
    this.myName = "frank";
  }
  onSubmit() {
    alert(this.myName);
  }

}*/
import { Component } from '@angular/core';
@Component({
  selector: 'app-root',
  template:`<section>
<form #myForm="ngForm">
Name:
<input type="text" pattern="[a-zA-Z ]*" minlength="3" required
[(ngModel)]="myName" name="firstName" #firstName="ngModel" >
<div [hidden]="firstName.valid || firstName.pristine">
This control is invalid.</div>
<p *ngIf="firstName?.errors?.['required']">This field is required.</p>
<p *ngIf="firstName?.errors?.['pattern']">
Only alphabetical characters are allowed.</p>
<p *ngIf="firstName?.errors?.['minlength']">
This entry must have at least three characters.</p>
<button type="submit" class="btn btn-default"
[disabled]="!myForm.form.valid" (click)="onSubmit()">Submit</button><br>
LastName:
<input type="text" pattern="[a-zA-Z ]*" minlength="2" required
[(ngModel)]="myLastName" name="LastName" #LastName="ngModel" >
<div [hidden]="LastName.valid || LastName.pristine">
This control is invalid.</div>
<p *ngIf="LastName?.errors?.['required']">This field is required.</p>
<p *ngIf="LastName?.errors?.['pattern']">
Only alphabetical characters are allowed.</p>
<p *ngIf="LastName?.errors?.['minlength']">
This entry must have at least three characters.</p>
<button type="submit" class="btn btn-default"
[disabled]="!myForm.form.valid" (click)="onSubmit()">Submit</button>
</form>
</section>
`
})
export class AppComponent {
  myName: string;
  myLastName: string;
  constructor() {
    this.myName = "frank";
    this.myLastName = ""
  }
  onSubmit() {
    alert(this.myName);
    alert(this.myLastName);
  }
}
