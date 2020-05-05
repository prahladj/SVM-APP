import { Injectable } from '@angular/core';
import { Subject, BehaviorSubject, AsyncSubject } from 'rxjs';

@Injectable({
  providedIn: 'root'
})

export class SaintDetaileService {
  public saintSubject = new BehaviorSubject('');

  constructor() { }
}
