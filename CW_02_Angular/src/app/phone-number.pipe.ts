import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'phoneNumber'
})
export class PhoneNumberPipe implements PipeTransform {

  transform(s: string): string {
    //let fah = celsius * 9 / 5 + 32;
    //let output = fah.toString() + " " + '\u2109'; // Unicode for Fahrenheit;
    let output="("+s.slice(0,3)+")"+s.slice(3,6)+"-"+s.slice(6,10);
    return output;
  }
}
