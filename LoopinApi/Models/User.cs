using System;
using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;

namespace LoopinApi.Models
{
    [Table("Users")]
    public class User
    {
        [Key]
        public Guid Id { get; set; }
        public DateTime CreatedAt { get; set; }
        public bool Active { get; set; }

        public User()
        {
            Id = Guid.NewGuid();
            CreatedAt = DateTime.Now;
            Active = true;
        }
    }
}
