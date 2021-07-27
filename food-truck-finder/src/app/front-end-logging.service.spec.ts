import { TestBed } from '@angular/core/testing';

import { FrontEndLoggingService } from './front-end-logging.service';

describe('FrontEndLoggingService', () => {
  let service: FrontEndLoggingService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(FrontEndLoggingService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
