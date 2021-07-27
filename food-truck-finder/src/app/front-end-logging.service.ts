import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class FrontEndLoggingService {

  frontEndLogs: string[] = [];

  add(frontEndLog: string) {
    this.frontEndLogs.push(frontEndLog);
  }

  constructor() { }
}
