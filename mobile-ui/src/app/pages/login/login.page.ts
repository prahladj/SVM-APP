import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-login',
  templateUrl: './login.page.html',
  styleUrls: ['./login.page.scss'],
})
export class LoginPage {
  public otpEnabled: boolean = false;

  constructor() { }

  enableOTP() {
    this.otpEnabled = true;
  }
}
