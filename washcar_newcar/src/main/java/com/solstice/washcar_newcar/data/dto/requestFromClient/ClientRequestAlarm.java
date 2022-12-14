package com.solstice.washcar_newcar.data.dto.requestFromClient;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.solstice.washcar_newcar.data.dto.responseFromWhattime.WhattimeAlarm;

import lombok.Data;

@Data
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class ClientRequestAlarm {
  private boolean emailGuest;
  private boolean smsGuest;
  private boolean kakaoGuest;
  private boolean smsGuestReminder;
  private int smsGuestReminderDuration;
  private String smsGuestReminderDurationKind;
  private boolean kakaoGuestReminder;
  private int kakaoGuestReminderDuration;
  private String kakaoGuestReminderDurationKind;
  private boolean emailHost;
  private boolean smsHost;
  private boolean kakaoHost;
  private String hostAlarmKind;
  private boolean cancelReschedule;
  private String cancelPolicy;
}
